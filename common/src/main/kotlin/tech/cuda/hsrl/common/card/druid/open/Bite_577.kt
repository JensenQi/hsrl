package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bite_577 : Card() {
    override val id = 577
    override val name = "撕咬"
    override val description = "使你的英雄获得4点护甲值，并在本回合中获得 +4攻击力。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "一般说来，你不把嘴里的肉嚼完，是不舍得变回人形态的。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e035d8ac52f9931b4faf26434ba0e0104eb25ecf8638e0f64b605e2b6c88bec7.png"
}
