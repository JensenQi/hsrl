package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BoggspineKnuckles_56413 : Card() {
    override val id = 56413
    override val name = "沼泽拳刺"
    override val description = "在你的英雄攻击后，随机将你的所有随从变形成为法力值消耗增加（1）点的随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.AshesOfOutland
    override val background = "此所谓手如柔荑，肤如凝脂……"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c528768326c05cf5277c2c94bb52a3273b6f7b4a287ae50231ae9941640c6e3a.png"
}
