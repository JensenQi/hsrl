package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SandwaspQueen_54038 : Card() {
    override val id = 54038
    override val name = "沙漠蜂后"
    override val description = "<b>战吼：</b>将两张2/1的“沙漠胡蜂”置入你的 手牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "谁忠心地跟随？充其量两个侍卫！"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4b9282275530f13a7e5256ca0fdd6a61a10f95c2b7f2eee223789f4567e28bbb.png"
}
