package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Flare_69969 : Card() {
    override val id = 69969
    override val name = "照明弹"
    override val description = "所有随从失去<b>潜行</b>，摧毁所有敌方<b>奥秘</b>，抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "它不但能让你的敌人无处遁形，还能让整个晚会熠熠生辉！"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9edf302b3d65098c97a39453217721ce4345c4d5ce147c53914fc79f04a6d8ed.png"
}
