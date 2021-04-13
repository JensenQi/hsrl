package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LazulsScheme_51376 : Card() {
    override val id = 51376
    override val name = "拉祖尔的阴谋"
    override val description = "直到你的下个回合，使一个敌方随从的攻击力降低1点。<i>（每回合都会升级！）</i>"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“暗影的噩梦险象环绕！孱弱的凡人惊声尖叫！骇人的阴谋即将来到……”"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b61e59a87aef53fc53990f6823f8521308dd62e56aaf53ed8b1950ff659f6674.png"
}
