package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Blackguard_42825 : Card() {
    override val id = 42825
    override val name = "黑色卫士"
    override val description = "每当你的英雄获得治疗时，便随机对一个敌方随从造成等量的 伤害。"
    override var cost: Int? = 6
    override var health: Int? = 9
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Kotf
    override val background = "“我有没有说过我曾单枪匹马干掉了一个29/29的克苏恩的事？”——雷诺·杰克逊"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4cad6667cee08f69f3dbe6e7a17320cfec4cd87acfedf2e4a797d4cb56f45e5f.png"
}
