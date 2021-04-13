package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LostInTheJungle_41912 : Card() {
    override val id = 41912
    override val name = "迷失丛林"
    override val description = "召唤两个1/1的白银之手新兵。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Ungoro
    override val background = "再也没有人见到过乔治和卡尔。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee5ed419073784b268f23e402e4f3a028b3eda3d65da2814823f40a67be251ec.png"
}
