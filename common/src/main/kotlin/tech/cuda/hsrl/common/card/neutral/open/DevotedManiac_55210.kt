package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DevotedManiac_55210 : Card() {
    override val id = 55210
    override val name = "虔信狂徒"
    override val description = "<b>突袭，战吼：</b> <b>祈求</b>迦拉克隆。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "虽说是一群狂徒，但他们对迦拉克隆的虔信坚定不移。"
    override val artist = "Anzka Nguyen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/de37ba3f6f06c8f77e651ede15f07dbd688c40b71ecf53b46e29d72645853c49.png"
}
