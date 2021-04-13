package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AltruisTheOutcast_56652 : Card() {
    override val id = 56652
    override val name = "流放者奥图里斯"
    override val description = "在你使用最左或最右边的一张手牌后，对所有敌人造成1点 伤害。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "来左边跟我画条灵翼龙，在你右边画一道邪能。"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d14d7fa9fb22dd0f27ace6608f7be69f845bc478cf88d9a8e434bfbf69149210.png"
}
