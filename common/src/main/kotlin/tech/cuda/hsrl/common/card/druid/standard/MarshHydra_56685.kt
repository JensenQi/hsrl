package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarshHydra_56685 : Card() {
    override val id = 56685
    override val name = "沼泽多头蛇"
    override val description = "<b>突袭</b> 在该随从攻击后，随机将一张法力值消耗为（8）的随从牌置入你的手牌。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.AshesOfOutland
    override val background = "蛇怪多头，凛凛巨口，飒飒奔踏，忿忿不休。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/782d5cab7eb14f0a2c709a97a801a8701a315579083dcdd0565591a301598f15.png"
}
