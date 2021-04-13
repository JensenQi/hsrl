package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IvoryKnight_39439 : Card() {
    override val id = 39439
    override val name = "象牙骑士"
    override val description = "<b>战吼：</b><b>发现</b>一张法术牌。为你的英雄恢复等同于其法力值消耗的生命值。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Karazhan
    override val background = "如何骑上去，这是一个问题。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2fa676b3b2f3a80bcb5811e36f5afa27930669b1d30f23d57b54e94f00025b27.png"
}
