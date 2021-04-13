package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SurrenderToMadness_50282 : Card() {
    override val id = 50282
    override val name = "疯入膏肓"
    override val description = "摧毁你的三个法力水晶。使你牌库中的所有随从牌获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RastakhansRumble
    override val background = "永不言弃，直接屈服！"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ddd490fdac4ad444ba1b2cb4a574901ac6da91ceae42ca68f068fac59d9e3394.png"
}
