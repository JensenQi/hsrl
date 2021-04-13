package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Coghammer_2027 : Card() {
    override val id = 2027
    override val name = "齿轮光锤"
    override val description = "<b>战吼：</b>随机使一个友方随从获得<b>圣盾</b>和<b>嘲讽</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Gvg
    override val background = "你们就是把一个大齿轮从机器上拆下来，在上面刻了点符文图案，然后用胶水粘上把手，就对我说这是一把灌注了神圣之力的强力武器？……好吧，似乎也不赖。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/01cd25ac9433b9943fc78ee866825368e6e38fee39dca90aa067d9f53fe16e1c.png"
}
