package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GlowTron_48982 : Card() {
    override val id = 48982
    override val name = "格洛顿"
    override val description = "<b>磁力</b>"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.BoomsdayProject
    override val background = "设计师耗费数周试图打造潜行版，最终还是因为罩子太亮而放弃了。"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6d02ba04d3ce0a3e271cf721568ca89593426ebe5b2c6869338249602727f248.png"
}
