package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilverHandRegent_2503 : Card() {
    override val id = 2503
    override val name = "白银之手教官"
    override val description = "<b>激励：</b>召唤一个1/1的白银之手新兵。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "新兵们就爱围着她转，她对此也表示很无奈。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cebf421ee99e019afce0d89a0eb366deb7605937d7104b9093227e1bd5d7a6f5.png"
}
