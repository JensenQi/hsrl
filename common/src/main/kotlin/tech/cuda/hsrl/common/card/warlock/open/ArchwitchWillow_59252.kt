package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArchwitchWillow_59252 : Card() {
    override val id = 59252
    override val name = "高阶女巫维洛"
    override val description = "<b>战吼：</b>随机从你的手牌和牌库中召唤一个恶魔。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "一个恶魔努力，全员共享成绩。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f6b3a79a5a78b24f4c6554058a6df884cba344e29aa4116010452295c3c603f7.png"
}
