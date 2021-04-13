package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CoordinatedStrike_56792 : Card() {
    override val id = 56792
    override val name = "协同打击"
    override val description = "召唤三个1/1并具有<b>突袭</b>的伊利达雷。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Legacy1635
    override val background = "三人行，必有舞师。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c46348b57840106999e0efdb1964be145d14df81c884330ccbf0cf62b64221d7.png"
}
