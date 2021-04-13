package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DireFrenzy_48201 : Card() {
    override val id = 48201
    override val name = "凶猛狂暴"
    override val description = "使一个野兽获得+3/+3。将它的三张复制洗入你的牌库，且这些复制都具有+3/+3。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.TheWitchwood
    override val background = "后面还是霍弗，一直都是霍弗，永远都是霍弗。"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/120de59a0dbd73d8204867b398c0f19d54ef31386491208cbc7543d449f1ece8.png"
}
