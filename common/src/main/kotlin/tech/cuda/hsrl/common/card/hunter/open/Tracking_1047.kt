package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Tracking_1047 : Card() {
    override val id = 1047
    override val name = "追踪术"
    override val description = "从你的牌库中<b>发现</b>一张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy1635
    override val background = "为了那些不知道该把什么牌放入套牌的人准备的！"
    override val artist = "Mauro Cascioli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc809252ea4db96411912598f6efc2cee10999c633bee5e66ebc8d0384086d9a.png"
}
