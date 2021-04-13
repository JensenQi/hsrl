package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoodooDoctor_68435 : Card() {
    override val id = 68435
    override val name = "巫医"
    override val description = "<b>战吼：</b> 恢复 2点生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "别以为带上大坏蛋面具，再把两根筷子插在嘴里，你就是巫医了，伙计。"
    override val artist = "Karl Richardson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4b98afafd223b65bb691f4b9c4f17a2b131ff8c0cc0c5dffd9a8192d6d9990a8.png"
}
