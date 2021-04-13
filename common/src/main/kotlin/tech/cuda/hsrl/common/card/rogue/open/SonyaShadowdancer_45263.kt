package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SonyaShadowdancer_45263 : Card() {
    override val id = 45263
    override val name = "影舞者索尼娅"
    override val description = "在一个友方随从死亡后，将它的1/1复制置入你的手牌，其法力值消耗变为（1）点。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "去爱，就像从没有受过伤害。去跳舞，就像有个1/1在看着你。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/af1c416b142cf02f6aa54ee6fb50b6099a58c3870c79fabb5f3a3e64f9bad2dd.png"
}
