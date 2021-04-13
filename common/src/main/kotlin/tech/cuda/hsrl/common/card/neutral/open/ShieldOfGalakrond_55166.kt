package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShieldOfGalakrond_55166 : Card() {
    override val id = 55166
    override val name = "迦拉克隆之盾"
    override val description = "<b>嘲讽，战吼：</b> <b>祈求</b>迦拉克隆。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "实际上，她只能护住迦拉克隆的大脚趾。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/80f375fd1d40056d7e542de4b9818d68891e14f87142283475db659dd3eec956.png"
}
