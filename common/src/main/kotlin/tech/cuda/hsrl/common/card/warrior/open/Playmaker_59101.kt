package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Playmaker_59101 : Card() {
    override val id = 59101
    override val name = "团伙核心"
    override val description = "在你使用一张<b>突袭</b>随从牌后，召唤一个剩余生命值为1的复制。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“计划是这样的：你走左边，我走右边，让那个受伤的去扛伤害。”"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/615c0f8a3e99a275af7bc611b41a93539980d3ec8b6328b6633377f8fa8c6229.png"
}
