package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SkeletalDragon_57688 : Card() {
    override val id = 57688
    override val name = "骸骨巨龙"
    override val description = "<b>嘲讽</b> 在你的回合结束时，将一张龙牌置入你的手牌。"
    override var cost: Int? = 7
    override var health: Int? = 9
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.AshesOfOutland
    override val background = "这条龙我要给差评，半个小时前刚刚买的。就是兀鹫那家店。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/167913195af10884a3930aeedd87fa39ff5f24153af0a4dc0735466692cd85a0.png"
}
