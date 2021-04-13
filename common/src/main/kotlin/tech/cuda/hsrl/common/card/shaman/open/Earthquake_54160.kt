package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Earthquake_54160 : Card() {
    override val id = 54160
    override val name = "地震术"
    override val description = "对所有随从造成 5点伤害，再对所有随从造成 2点伤害。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "地面震破，在卡利姆多，探险者为谁拼搏。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/badf3a51e6b14652b5e06c67dfadf5511c7ed9b04c71ca4a53744f8278da30a1.png"
}
