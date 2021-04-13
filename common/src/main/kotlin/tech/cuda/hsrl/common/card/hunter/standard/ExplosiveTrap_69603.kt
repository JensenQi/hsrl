package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExplosiveTrap_69603 : Card() {
    override val id = 69603
    override val name = "爆炸陷阱"
    override val description = "<b>奥秘：</b>当你的英雄受到攻击，对所有敌人造成 2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "普通陷阱捉到的是猎物；爆炸陷阱捉到的是烤熟的食物！"
    override val artist = "Brandon Kitkouski"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9dfb8f3f82ab5a003012e4b07af6ab63b58da5f4881499c43b440a1eb127cfc8.png"
}
