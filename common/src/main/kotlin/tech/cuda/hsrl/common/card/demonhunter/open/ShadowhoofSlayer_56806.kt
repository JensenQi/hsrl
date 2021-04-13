package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowhoofSlayer_56806 : Card() {
    override val id = 56806
    override val name = "影蹄杀手"
    override val description = "<b>战吼：</b>在本回合中，使你的英雄获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Legacy1635
    override val background = "在萨格拉斯降临之前，他本是个卑微的精灵弓箭手。"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/62e7496da33d908e303103a6bfefa6f2f0af1ee5f6994ce927dfdb44f0a8e9ed.png"
}
