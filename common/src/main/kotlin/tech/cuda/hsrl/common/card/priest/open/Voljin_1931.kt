package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Voljin_1931 : Card() {
    override val id = 1931
    override val name = "沃金"
    override val description = "<b>战吼：</b>与另一个随从交换生命值。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Gvg
    override val background = "所谓暗影猎手，无非就是精通巫毒妖术的暗影牧师。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b3c96b403f080f607273295c4a556cd529241ff59d8a2e8da869b72290533a14.png"
}
