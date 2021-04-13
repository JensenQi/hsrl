package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EscapedManasaber_56068 : Card() {
    override val id = 56068
    override val name = "奔逃的魔刃豹"
    override val description = "<b>潜行</b> 每当该随从攻击，便获得一个仅限本回合可用的法力水晶。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "圈养的魔刃豹也没好多少——天天抓你的家具，还会乱吐法力毛球。"
    override val artist = "Gabe Gonzalez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ff47d91401816262b91c40f69d4200ef00232a366de1c43868c69700203819db.png"
}
