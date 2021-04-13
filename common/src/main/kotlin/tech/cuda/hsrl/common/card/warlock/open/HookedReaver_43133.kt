package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HookedReaver_43133 : Card() {
    override val id = 43133
    override val name = "铁钩掠夺者"
    override val description = "<b>战吼：</b>如果你的生命值小于或等于15点，则获得+3/+3和<b>嘲讽</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "铁钩只是个装饰，实战中并不怎么需要。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a26fb47c2e9e49165f7a1cd7284ab921f304617762650220397507d98e28c430.png"
}
