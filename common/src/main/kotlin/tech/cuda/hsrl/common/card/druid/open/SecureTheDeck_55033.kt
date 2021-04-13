package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SecureTheDeck_55033 : Card() {
    override val id = 55033
    override val name = "保护甲板"
    override val description = "<b>支线任务：</b> 用你的英雄攻击两次。<b>奖励：</b>将三张“爪击”法术牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“搞定了，老大。可是把甲板保护起来之后我们要站在哪儿呢？”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d5f48ed6f8bb4fcc590dc9ba602009d5878d278ac144b7111b44b02441074e51.png"
}
