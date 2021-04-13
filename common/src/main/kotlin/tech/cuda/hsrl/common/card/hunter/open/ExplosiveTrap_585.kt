package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExplosiveTrap_585 : Card() {
    override val id = 585
    override val name = "爆炸陷阱"
    override val description = "<b>奥秘：</b>当你的英雄受到攻击，对所有敌人造成 2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "普通陷阱捉到的是猎物；爆炸陷阱捉到的是烤熟的食物！"
    override val artist = "Brandon Kitkouski"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b6b38210c07d9236f34782bf95384a1981ed4cb3a7cc3e8a47a3550af3bc8cb5.png"
}
