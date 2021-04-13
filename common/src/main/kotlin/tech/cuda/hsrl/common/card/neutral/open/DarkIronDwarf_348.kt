package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkIronDwarf_348 : Card() {
    override val id = 348
    override val name = "黑铁矮人"
    override val description = "<b>战吼：</b>在本回合中，使一个随从获得+2攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "黑铁矿脉的守护者。也许那是最令人头疼的矿脉，因为你必须在某个特殊的地方才能熔炼它。"
    override val artist = "Scott Hampton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8cd75bda688b1870aaf392acdb7872ab3acd5c36e6aec175ea9d0db7eb1a0077.png"
}
