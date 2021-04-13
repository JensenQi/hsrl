package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurksparkEel_46996 : Card() {
    override val id = 46996
    override val name = "阴燃电鳗"
    override val description = "<b>战吼：</b> 如果你的牌库中只有法力值消耗为偶数的牌，造成2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy4
    override val background = "用来做鳗鱼饭最合适不过了！"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ae9133a542b61083a47063e5bc2d2f1c256669980276bda630f0558519fd2519.png"
}
