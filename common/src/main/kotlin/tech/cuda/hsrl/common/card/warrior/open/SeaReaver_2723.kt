package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SeaReaver_2723 : Card() {
    override val id = 2723
    override val name = "破海者"
    override val description = "当你抽到该牌时，对你的随从造成 1点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Tgt
    override val background = "虽然名为破海者，但海底会成为他们的最终归宿。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e9ae41221c49dfec43964043847acab59d4b1f27a78d7cf3001f5f2066b97d0b.png"
}
