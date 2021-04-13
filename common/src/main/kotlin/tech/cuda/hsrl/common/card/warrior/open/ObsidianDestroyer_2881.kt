package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ObsidianDestroyer_2881 : Card() {
    override val id = 2881
    override val name = "黑曜石毁灭者"
    override val description = "在你的回合结束时，召唤一只1/1并具有<b>嘲讽</b>的甲虫。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Loe
    override val background = "黑曜石毁灭者最大的兴趣爱好就是毁灭黑曜石。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f57f2533b738b32746dff9a2c68aaa19be8d57cf09b3987bdd86227df893208b.png"
}
