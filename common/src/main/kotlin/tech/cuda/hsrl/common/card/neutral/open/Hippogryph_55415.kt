package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hippogryph_55415 : Card() {
    override val id = 55415
    override val name = "角鹰兽"
    override val description = "<b>突袭</b> <b>嘲讽</b>"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "角鹰兽，集凶猛与优雅于一身，堪称一种雄壮的生物。褪毛阶段除外。"
    override val artist = "Gabe Gonzalez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d35db2413d38ef3cbd54091568f9554019955416746ac2a5a9678cf88d9e8c2e.png"
}
