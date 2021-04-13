package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RinTheFirstDisciple_46040 : Card() {
    override val id = 46040
    override val name = "首席门徒林恩"
    override val description = "<b>嘲讽，亡语：</b> 将“第一封印”置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "已知的，未知的，所有的一切都会被湮没。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9aebbb0f87b3d2d8ee388a63a2b37102656f29797d485e5ad73372a07fdfb5fa.png"
}
