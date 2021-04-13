package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnderlightAnglingRod_56443 : Card() {
    override val id = 56443
    override val name = "幽光鱼竿"
    override val description = "在你的英雄攻击后，随机将一张鱼人牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“我要的明明是灰烬使者，不是灰尘使者！”"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8e41fafb2619cce5d47ae302988719cc6a18d720aca3c0888786ff1072c7c94.png"
}
