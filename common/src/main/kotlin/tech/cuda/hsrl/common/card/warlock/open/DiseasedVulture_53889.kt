package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DiseasedVulture_53889 : Card() {
    override val id = 53889
    override val name = "染病的兀鹫"
    override val description = "每当你的英雄在自己的回合受到伤害，随机召唤一个法力值消耗为（3）的随从。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "它都从栖木上掉下来了！已经没气了！这就是只死兀鹫！"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/59b0ed92bbb2e8f0cbd11912bf883fd0395b83950fa06c9ae3b38b4d354a0651.png"
}
