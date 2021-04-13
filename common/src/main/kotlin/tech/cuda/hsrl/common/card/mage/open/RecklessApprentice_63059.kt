package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RecklessApprentice_63059 : Card() {
    override val id = 63059
    override val name = "鲁莽的学徒"
    override val description = "<b>战吼：</b>向所有敌人发射你的英雄技能。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "那本是一次绝好的学习经历，直到有人手滑开了boss。"
    override val artist = "Yaohua Xu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a16bb399b839189b5d8deda73a43d5e07201cc620034b12f6d10bc1eececfbf8.png"
}
