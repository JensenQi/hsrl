package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkIronDwarf_69827 : Card() {
    override val id = 69827
    override val name = "黑铁矮人"
    override val description = "<b>战吼：</b>在本回合中，使一个随从获得+2攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "黑铁矿脉的守护者。也许那是最令人头疼的矿脉，因为你必须在某个特殊的地方才能熔炼它。"
    override val artist = "Scott Hampton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/847e2ed9c136d1740d00278a291a41bc0facb46fe448d336197eccbc8499be46.png"
}
