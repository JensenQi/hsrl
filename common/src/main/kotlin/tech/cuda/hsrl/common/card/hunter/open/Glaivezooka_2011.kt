package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Glaivezooka_2011 : Card() {
    override val id = 2011
    override val name = "重型刃弩"
    override val description = "<b>战吼：</b>随机使一个友方随从获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Gvg
    override val background = "它可以完成所有火箭炮能完成的任务，只是视觉效果差了点。"
    override val artist = "Gino Whitehall"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a6062c8893bac60c961ff26608b92317e153261f2a23fe125fc0afcb7b56395.png"
}
