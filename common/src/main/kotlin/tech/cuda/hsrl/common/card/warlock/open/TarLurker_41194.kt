package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TarLurker_41194 : Card() {
    override val id = 41194
    override val name = "焦油潜伏者"
    override val description = "<b>嘲讽</b> 在你对手的回合获得+3攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Ungoro
    override val background = "潜了这么久，终于能上来冒个泡了…"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/12b3ad1e62a6cf85300990d11c6d7537dcc564d245ff9716feac0641c8b4768e.png"
}
