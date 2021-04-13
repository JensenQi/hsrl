package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PriestessOfFury_58455 : Card() {
    override val id = 58455
    override val name = "愤怒的女祭司"
    override val description = "在你的回合结束时，造成6点伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "怒了！她只有六把战刃，盲眼监视者有八把！人家的邪能都比她的绿。"
    override val artist = "Bayard Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8fd2d9e64281a0e3724cdad98f408224e114e1be42cec9e3d358617cc2a7f7cb.png"
}
