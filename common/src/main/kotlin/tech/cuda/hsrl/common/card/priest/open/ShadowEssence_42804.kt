package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowEssence_42804 : Card() {
    override val id = 42804
    override val name = "暗影精华"
    override val description = "随机挑选你牌库里的一个随从，召唤一个5/5的复制。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Kotf
    override val background = "用过量就会变得跟她一样黑。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ffd6a51a3e5dd1ff111a2291ce037a14222534f4a6091496aa52b432be41021e.png"
}
