package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChopshopCopter_56064 : Card() {
    override val id = 56064
    override val name = "拆件旋翼机"
    override val description = "在一个友方机械死亡后，随机将一张机械牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "发明是混乱之母。"
    override val artist = "Servando Lupini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/79f8af4bfb38f32755780788bd07c8769442dcf3215b1de344b76a759cf3a451.png"
}
