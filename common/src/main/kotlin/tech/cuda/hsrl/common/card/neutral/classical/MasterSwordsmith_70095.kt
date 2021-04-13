package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MasterSwordsmith_70095 : Card() {
    override val id = 70095
    override val name = "铸剑师"
    override val description = "在你的回合结束时，随机使另一个友方随从获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他正在打造一把称为“连枷斧”的武器，但是其他铸剑师都表示那是不可能做到的。"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8e34e2e0f337420e6f0d3dd4f5f8afbeab62ae8f772776ab7af3d8f36ec01f0d.png"
}
