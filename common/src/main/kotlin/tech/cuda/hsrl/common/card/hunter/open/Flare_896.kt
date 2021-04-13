package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Flare_896 : Card() {
    override val id = 896
    override val name = "照明弹"
    override val description = "所有随从失去<b>潜行</b>，摧毁所有敌方<b>奥秘</b>，抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "它不但能让你的敌人无处遁形，还能让整个晚会熠熠生辉！"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c1dc506441ea4187f05f771d2fe7b5001108b17be604c4d6a32e4f8692442314.png"
}
