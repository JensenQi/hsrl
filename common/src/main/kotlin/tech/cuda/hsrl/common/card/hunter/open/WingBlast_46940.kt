package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WingBlast_46940 : Card() {
    override val id = 46940
    override val name = "飞翼冲击"
    override val description = "对一个随从造成 4点伤害。如果在本回合中有一个随从死亡，该牌的法力值消耗为（1）点。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.TheWitchwood
    override val background = "艾莫莉丝曾用这招干掉过很多冒险者，屡试不爽。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3a73d37b5ee93669fc6f78ec6ae83f129bb13f96dd3677d61c9754dd31bea384.png"
}
