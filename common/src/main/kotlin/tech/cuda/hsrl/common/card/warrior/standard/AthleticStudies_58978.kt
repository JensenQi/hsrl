package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AthleticStudies_58978 : Card() {
    override val id = 58978
    override val name = "体能研习"
    override val description = "<b>发现</b>一张<b>突袭</b>随从牌。你的下一张<b>突袭</b>随从牌法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "适合考前突击。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a1098f366a27a34681ab5e644a8b16725aae70998ac73085d664eaf5249b07fa.png"
}
