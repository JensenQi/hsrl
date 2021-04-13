package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OasisSnapjaw_68380 : Card() {
    override val id = 68380
    override val name = "绿洲钳嘴龟"
    override val description = ""
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "它的梦想是能够像它的偶像那样飞行和吐息火焰，但这样的梦想永远无法实现。"
    override val artist = "Ittoku"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/269c02b22d22e53e01e6f7e27e45e04fafaf54d2735ad7d339672662624cd27e.png"
}
