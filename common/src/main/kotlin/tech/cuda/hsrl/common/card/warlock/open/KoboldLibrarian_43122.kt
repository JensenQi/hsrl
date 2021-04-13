package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KoboldLibrarian_43122 : Card() {
    override val id = 43122
    override val name = "狗头人图书管理员"
    override val description = "<b>战吼：</b> 抽一张牌。对你的英雄造成2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "狗头人用蜡油十进制法来分类图书。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b81d607333d48ee3809113b2c5820d328106fc4e515c767688bcf624b61ebb40.png"
}
