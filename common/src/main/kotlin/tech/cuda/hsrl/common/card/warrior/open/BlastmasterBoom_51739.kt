package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlastmasterBoom_51739 : Card() {
    override val id = 51739
    override val name = "爆破之王砰砰"
    override val description = "<b>战吼：</b>你对手的牌库中每有一张“炸弹”牌，便召唤两个1/1的砰砰机器人。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RiseOfShadows
    override val background = "给他一点添加剂，他可以飞越整片天空。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c16ddf0b515981849ee79f38809ca195f40ad3387b092f7b681647abec0d80a2.png"
}
