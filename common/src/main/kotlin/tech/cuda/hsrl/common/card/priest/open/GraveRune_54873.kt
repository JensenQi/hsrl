package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GraveRune_54873 : Card() {
    override val id = 54873
    override val name = "墓地符文"
    override val description = "使一个随从获得“<b>亡语：</b>召唤该随从的两个复制。”"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "墓然回首，那牛却在符文阑珊处。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/95c6c6a2ff243c0293f650b96214b925b2b443a980c0776c578f37ce211b516c.png"
}
